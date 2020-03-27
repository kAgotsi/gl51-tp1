package gl51.tp1.service.image

import gl51.tp1.data.Image

/**
 * This clas enables to add filigramme
 * @author komi AGOTSI
 */
interface FiligrameService {
    /**
     * add filigramme
     * @param imageSource
     * @return logo
     */
    Image add(Image imageSource)
}