package gl51.tp1.service.ip.impl

import gl51.tp1.data.Ip
import gl51.tp1.service.ip.IPService
import gl51.tp1.service.ip.IpConverterService

import javax.inject.Inject

class BinaryConverterServiceImpl implements IpConverterService {

    @Inject
    IPService service

    @Override
    String getAndConvertIp() {
        Ip ip = service.fetchIp()
        ///
    }
}
