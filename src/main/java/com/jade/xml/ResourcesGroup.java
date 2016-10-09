package com.jade.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.common.collect.Lists;

@SuppressWarnings("restriction")
@XmlRootElement(name = "resources")
public class ResourcesGroup {
	@XmlElement(name = "array")
	public List<AreaItem> arrayItems = Lists.newArrayList();
	
}
