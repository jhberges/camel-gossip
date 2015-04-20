# camel-gossip
```camel-gossip``` is an [Apache Camel](http://camel.apache.com) component that utilitizes the Gossip protocol to control routes via the [Controlbus Component](http://camel.apache.org/controlbus-component.html).

Draft usage:

    from("gossip://<bound ip>:<port>/?peers=<listOfPeers>&routeIds=<listOfRouteIdsToControl>").to("controlbus:route");
    
Where ```listOfRouteIdsToControl``` are started/stopped upon this node being promoted/demoted.

This is useful when you have a consumer route running in an environment where you need fail-over-type support, but cannot use the likes of Zookeeper for some reason.
