package gl51.tp1.service.image.impl

import gl51.tp1.data.Image
import gl51.tp1.service.image.ImageService
import gl51.tp1.service.image.ResizerService

import javax.inject.Inject

/**
 * This class implements @see gl51.tp1.service.Resizer
 * @author Gédéon AGOTSI
 * @version 1.0
 */
class ResizerImpl implements ResizerService{

    @Override
    Image resize(Image image,int x, int y) {
        image.setX(x)
        image.setY(y)
        return image
    }
}
