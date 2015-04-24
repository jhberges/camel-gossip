package jhberges.camel.gossip;

import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;

public class GossipEndpoint extends DefaultEndpoint {
	public GossipEndpoint() {
		super();
	}

	public GossipEndpoint(final String uri, final GossipComponent gossipComponent) {
		super(uri, gossipComponent);
	}

	public Consumer createConsumer(final Processor processor) throws Exception {
		return new GossipConsumer(this, processor);
	}

	public Producer createProducer() throws Exception {
		return new GossipProducer(this);
	}

	public boolean isSingleton() {
		return true;
	}

}
