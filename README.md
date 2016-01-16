# iptc-newsml

[![Build Status](https://api.travis-ci.org/gextech/iptc-newsml.svg)](https://travis-ci.org/gextech/iptc-newsml)
[![Apache License 2](https://img.shields.io/badge/license-ASF2-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0.txt)


A newsml parser for g2 and 1.2

## Environment

[!["JDK"](https://img.shields.io/badge/JDK-8.0+-F30000.svg?style=flat)](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

## Usage

You can use the NewsMLTool class in order to parse NewsML v1.2 and G2 versions, it is simple enought just do it like this:

```java

NewsML newsItem = NewsMLTool.parseV12Message(inputStream);

// Remember when using news ml 1.2 that the message
// will contain nitf, there is a util to convert your node to
// nitf

Nitf nitf = NewsMLTool.elementToNitf(element);

// or 

NewsMessage newsMessage = NewsMLTool.parseG2Message(inputStream);


```

## GitHub, Factoids and Stats

[!["Forks"](https://img.shields.io/github/forks/gextech/iptc-newsml.svg?style=flat)](https://github.com/gextech/iptc-newsml/network)
[!["Release"](https://img.shields.io/github/release/gextech/iptc-newsml.svg?style=flat)](https://github.com/gextech/iptc-newsml/releases)
[!["Issues"](https://img.shields.io/github/issues/gextech/iptc-newsml.svg?style=flat)](https://github.com/gextech/iptc-newsml/issues)

