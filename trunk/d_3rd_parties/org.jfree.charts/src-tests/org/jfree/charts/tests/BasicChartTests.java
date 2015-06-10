package org.jfree.charts.tests;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;


public class BasicChartTests extends TestCase {

	 /** A chart. */
    private JFreeChart chart;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(BasicChartTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public BasicChartTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        this.chart = createLineChart();
    }

    /**
     * Draws the chart with a null info object to make sure that no exceptions
     * are thrown (a problem that was occurring at one point).
     */
    public void testDrawWithNullInfo() {

        boolean success = false;
        try {
            BufferedImage image = new BufferedImage(200 , 100,
                    BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = image.createGraphics();
            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
                    null);
            g2.dispose();
            
            success = true;
        }
        catch (Exception e) {
            success = false;
        }
        assertTrue(success);
    }

    public void testDrawDumpToFile() {
        boolean success = false;
        try {
            BufferedImage image = new BufferedImage(200 , 100,
                    BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = image.createGraphics();
            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
                    null);
            g2.dispose();
            
            success = true;

            
            File outputFile = new File("testDrawDumpToFile.bmp");
            
            ImageIO.write(image, "bmp", outputFile);
            
        }
        catch (Exception e) {
            success = false;
        }
        assertTrue(success);
        
    }
    
    /**
     * Replaces the chart's dataset and then checks that the new dataset is OK.
     */
    public void testReplaceDataset() {

        // create a dataset...
        Number[][] data = new Integer[][]
            {{new Integer(-30), new Integer(-20)},
             {new Integer(-10), new Integer(10)},
             {new Integer(20), new Integer(30)}};

        CategoryDataset newData = DatasetUtilities.createCategoryDataset("S",
                "C", data);

        LocalListener l = new LocalListener();
        this.chart.addChangeListener(l);
        CategoryPlot plot = (CategoryPlot) this.chart.getPlot();
        plot.setDataset(newData);
        assertEquals(true, l.flag);
        ValueAxis axis = plot.getRangeAxis();
        Range range = axis.getRange();
        assertTrue("Expecting the lower bound of the range to be around -30: "
                   + range.getLowerBound(), range.getLowerBound() <= -30);
        assertTrue("Expecting the upper bound of the range to be around 30: "
                   + range.getUpperBound(), range.getUpperBound() >= 30);

    }

    /**
     * Check that setting a tool tip generator for a series does override the
     * default generator.
     */
    public void testSetSeriesToolTipGenerator() {
        CategoryPlot plot = (CategoryPlot) this.chart.getPlot();
        CategoryItemRenderer renderer = plot.getRenderer();
        StandardCategoryToolTipGenerator tt
                = new StandardCategoryToolTipGenerator();
        renderer.setSeriesToolTipGenerator(0, tt);
        CategoryToolTipGenerator tt2 = renderer.getToolTipGenerator(0, 0);
        assertTrue(tt2 == tt);
    }

    /**
     * Check that setting a URL generator for a series does override the
     * default generator.
     */
    public void testSetSeriesURLGenerator() {
        CategoryPlot plot = (CategoryPlot) this.chart.getPlot();
        CategoryItemRenderer renderer = plot.getRenderer();
        StandardCategoryURLGenerator url1
                = new StandardCategoryURLGenerator();
        renderer.setSeriesItemURLGenerator(0, url1);
        CategoryURLGenerator url2 = renderer.getItemURLGenerator(0, 0);
        assertTrue(url2 == url1);
    }

    /**
     * Create a line chart with sample data in the range -3 to +3.
     *
     * @return The chart.
     */
    private static JFreeChart createLineChart() {

        // create a dataset...
        Number[][] data = new Integer[][]
            {{new Integer(-3), new Integer(-2)},
             {new Integer(-1), new Integer(1)},
             {new Integer(2), new Integer(3)}};

        CategoryDataset dataset = DatasetUtilities.createCategoryDataset("S",
                "C", data);

        // create the chart...
        return ChartFactory.createLineChart(
            "Line Chart",
            "Domain", "Range",
            dataset,
            PlotOrientation.HORIZONTAL,
            true,     // include legend
            true,
            true
        );

    }

    /**
     * A chart change listener.
     *
     */
    static class LocalListener implements ChartChangeListener {

        /** A flag. */
        private boolean flag = false;

        /**
         * Event handler.
         *
         * @param event  the event.
         */
        public void chartChanged(ChartChangeEvent event) {
            this.flag = true;
        }

    }
}