import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class OCRReader {

    @Test
    public void ReadPDFFile() throws IOException {
        File file = new File("C:\\Users\\ASOSA INFO TECH\\Downloads\\file-example_PDF_500_kB.pdf");
        FileInputStream fileInputStream = new FileInputStream(file);

        PDDocument pdDocument = PDDocument.load(fileInputStream);
        PDFTextStripper pdfTextStripper = new PDFTextStripper();
        pdfTextStripper.setStartPage(1);
        pdfTextStripper.setEndPage(44);
        String docText =  pdfTextStripper.getText(pdDocument);
        System.out.println(docText);
        pdDocument.close();
        fileInputStream.close();
    }
}
