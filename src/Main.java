import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) throws SAXException, IOException {
		// if(args.length > 0){
		try {
			Properties config = new Properties();
			FileInputStream file = new FileInputStream("config.properties");
			config.load(file);

			Controller controller = new Controller(config);
			controller.loadDevices();
			//System.out.println("OPA");
			controller.connectDeviceMqtt();
		} catch (IOException ioe) {
			// }else{
			System.out.println("To execute IoT Virtual Device you need pass config.properties path as parameter");
			System.exit(-1);
		}

	}

}
