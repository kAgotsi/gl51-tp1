package gl51.tp1.service.image

import gl51.tp1.data.Image

/**
 * This interface enables to resize any image
 * @author Gédéon AGOTSi
 * @version 1.0
 */
interface ResizerService {

    /**
     * resize image according to the new x,y
     * @param x  of image
     * @param y  of image
     * @param image image
     * @return resized image
     */
    Image resize(Image image, int x, int y);
}