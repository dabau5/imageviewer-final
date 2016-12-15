import java.awt.Color;

/**
 * An image filter to remove all green values from an image.
 * 
 * @author Alex C
 * @version 1.0
 */
public class NoGreenFilter extends Filter
{
    /**
     * Constructor for objects of class VintageFilter.
     * @param name The name of the filter.
     */
    public NoGreenFilter (String name)
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
                
                image.setPixel(x, y, new Color(pix.getRed(), 0, pix.getBlue()));
            }
        }
    }
}
