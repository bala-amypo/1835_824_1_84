@Service
public class ServiceEntryServiceImpl implements ServiceEntryService {

    @Autowired
    private ServiceEntryRepository serviceEntryRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public ServiceEntry createServiceEntry(ServiceEntry entry) {
        return serviceEntryRepository.save(entry);
    }

    @Override
    public ServiceEntry getServiceEntryById(Long id) {
        return serviceEntryRepository.findById(id).orElse(null);
    }

    @Override
    public List<ServiceEntry> getEntriesForVehicle(Long vehicleId) {
        return serviceEntryRepository.findByVehicleId(vehicleId);
    }

    @Override
    public List<ServiceEntry> getEntriesByGarage(Long garageId) {
        return serviceEntryRepository
                .findByGarageIdAndOdometerReadingGreaterThanEqual(garageId, 0);
    }

    @Override
    public List<ServiceEntry> getEntriesByVehicleAndDateRange(
            Long vehicleId,
            LocalDate from,
            LocalDate to
    ) {
        return serviceEntryRepository
                .findByVehicleIdAndServiceDateBetween(vehicleId, from, to);
    }
}
