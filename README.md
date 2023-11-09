
This repo contains Java based project to present comparing of two alternative approaches in generation of unit tests. 
We used two products:
<ul>
<li>early version of Didro as representative of our own approach;</li>
<li>typical solution with approach that is used in all competitive products.</li>
</ul>

Due to limited capabilities of early version of the Didro product we performed all generations on Java code that is supported by current version of Didro.
The goal of current Didro's early version is covering by unit tests of all possible scenarios in target method (data variety and edge cases currently are not in focus, this will be implementet in the next version).
 
There are performed 24 generations of unit tests (number in package name corresponds to number of a particular try).
All generated unit tests are placed in corresponding packages in <b>test</b> directory.

