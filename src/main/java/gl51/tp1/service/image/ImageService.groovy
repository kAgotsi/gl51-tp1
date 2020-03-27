package gl51.tp1.service.image

import gl51.tp1.data.Image

/**
 * This interface enables to acces local database
 * @author Gédéon AGOTSi
 * @version 1.0
 */
interface ImageService {
    /**
     * update image on local database
     * @param image which will be update
     * @return image updated
     */
    Image update(Image image)

    /**
     * fetch the uploaded picture
     * @return
     */
    Image fetch()
}