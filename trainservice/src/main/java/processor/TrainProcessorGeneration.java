package processor;

import generated.Train;
import generated.Wagon;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.List;
import java.util.UUID;


public class TrainProcessorGeneration {
    public void process(Exchange exchange) {
        Train body = exchange.getIn().getBody(Train.class);

        body.setId(generateUUID());
        generateWagonsId((List<Wagon>) body.getWagons());

        exchange.getOut().setBody(body);
    }

    public String generateUUID(){
        return UUID.randomUUID().toString();
    }

    public void generateWagonsId(List<Wagon> wagons) {
        for (Wagon wagon:wagons) {
            if (wagon.getId() != null) {
                wagon.setId(generateUUID());
            }
        }
    }
}
