package jhberges.camel.gossip;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;

public class GossipProducer extends DefaultProducer {

	public GossipProducer(final GossipEndpoint gossipEndpoint) {
		super(gossipEndpoint);
	}

	public void process(final Exchange arg0) throws Exception {
		// TODO Auto-generated method stub

	}

}
