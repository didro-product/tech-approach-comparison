
This repo contains Java based project to present comparing of two alternative approaches in generation of unit tests. 
We used two products:
<ul>
<li>demo version of the Didro product (https://www.didro.ai) as representative of our own approach;</li>
<li>Machinet AI product as representative of typical approach used on the market.</li>
</ul>

Due to limited capabilities of early version of the Didro product we performed all generations on Java code that is supported by said version of Didro.
The goal of current Didro's early version is covering by unit tests of all possible execution scenarios of target method (data variety and edge cases currently are not in focus, this will be implemented in the next version).
To use the Didro product you can try our [plugin for IntelliJ IDEA](https://plugins.jetbrains.com/plugin/22264-didro). 
 
There were performed a lot of unit test generations (number in package name corresponds to number of a particular try).
All generations grouped by level of complexity of target methods: simple, average and complex. 
All generated unit tests are placed in corresponding packages in <b>test</b> directory.

