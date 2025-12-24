

@Service
public class ServicePartServiceImpl implements ServicePartService {

    @Autowired
    private ServicePartRepository servicePartRepository;

    @Override
    public ServicePart createServicePart(ServicePart servicePart) {
        if (servicePart.getQuantity() <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        return servicePartRepository.save(servicePart);
    }

    @Override
    public ServicePart getPartById(Long id) {
        return servicePartRepository.findById(id).orElse(null);
    }

    @Override
    public List<ServicePart> getPartsForEntry(String serviceEntry) {
        return servicePartRepository.findByServiceEntry(serviceEntry);
    }
}
