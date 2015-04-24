package jhberges.camel.gossip;

import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.impl.DefaultComponent;

public class GossipComponent extends DefaultComponent {

	@Override
	protected Endpoint createEndpoint(final String uri, final String remaining, final Map<String, Object> parameters) throws Exception {
		final GossipEndpoint gossipEndpoint = new GossipEndpoint(uri, this);
		setProperties(gossipEndpoint, parameters);
		return gossipEndpoint;
	}

}
