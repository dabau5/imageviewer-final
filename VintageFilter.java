import java.awt.Color;

/**
 * An image filter to add sepia tone to an image.
 * 
 * @author Alex C
 * @version 1.0
 */
public class VintageFilter extends Filter
{
    /**
     * Constructor for objects of class VintageFilter.
     * @param name The name of the filter.
     */
    public VintageFilter (String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int red = (int)pix.getRed();
                int blue = (int)pix.getBlue();
                int green = (int)pix.getGreen();
                int r2, g2, b2;
                r2 = (int)((red * .393) + (green * .769) + (blue * .189)); //values for 
                g2 = (int)((red * .349) + (green * .686) + (blue * .168)); //RGB conversion
                b2 = (int)((red * .168) + (green * .534) + (blue * .131)); //found online
                if(r2 > 255) r2 = 255;
                if(g2 > 255) g2 = 255;
                if(b2 > 255) b2 = 255;
                image.setPixel(x, y, new Color(r2, g2, b2));
            }
        }
    }
}
