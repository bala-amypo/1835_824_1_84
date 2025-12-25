@Service
public class VerificationLogServiceImpl implements VerificationLogService {

    @Autowired
    private VerificationLogRepository repository;

    @Override
    public VerificationLog createLog(VerificationLog log) {
        return repository.save(log);
    }

    @Override
    public List<VerificationLog> getLogsForEntry(Long serviceEntryId) {
        return repository.findByServiceEntryId(serviceEntryId);
    }
}
