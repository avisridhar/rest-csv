package healthcare.carta.interview.restcsv.service;

import healthcare.carta.interview.restcsv.util.CsvUtil;
import org.springframework.stereotype.Service;

import java.io.InputStream;
@Service
public class CsvFileService {
    public double process(InputStream file, String col) {
        try {
            return CsvUtil.processCsvFile(file, col);
        } catch(Exception e) {
            throw new RuntimeException("FAIL! -> message = " + e.getMessage());
        }
    }
}
