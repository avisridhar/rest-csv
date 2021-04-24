package healthcare.carta.interview.restcsv.controller;

import healthcare.carta.interview.restcsv.model.Message;
import healthcare.carta.interview.restcsv.service.CsvFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class ProcessCsvFileController {
    @Autowired
    CsvFileService csvFileService;

    @PostMapping("/")
    Message processCSVFile(@RequestParam("data") MultipartFile csvfile, @RequestParam("column") String col) throws IOException {
        return new Message(csvFileService.process(csvfile.getInputStream(), col));
    }

}
