import java.io.IOException;

import io.github.aaronclong.hurtlocker.files.ReceiptPrinter;
import org.apache.commons.io.IOUtils;

public class Main {
  public String readRawDataToString() throws Exception {
    ClassLoader classLoader = getClass().getClassLoader();
    return IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
  }

  public static void main(String[] args) throws Exception {
    ReceiptPrinter receipt =  new ReceiptPrinter();
    System.out.println(receipt);
  }
}
