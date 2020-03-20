package gl51.tp1.service.image

import gl51.tp1.data.Image


/**
 * This interface enables to acces cloud
 * @author Gédéon AGOTSI
 * @version 1.0
 */
interface CloudService {

    /**
     * save image on cloud
     * @param image
     */
    void save(Image image)
}