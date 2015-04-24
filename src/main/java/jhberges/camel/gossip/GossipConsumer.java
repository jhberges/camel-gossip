package jhberges.camel.gossip;

import org.apache.camel.Processor;
import org.apache.camel.impl.ScheduledPollConsumer;

public class GossipConsumer extends ScheduledPollConsumer {

	public GossipConsumer(final GossipEndpoint gossipEndpoint, final Processor processor) {
		super(gossipEndpoint, processor);
	}

	@Override
	protected int poll() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
