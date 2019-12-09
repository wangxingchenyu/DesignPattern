package com.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SAX 包来解析xml simple apis for xml
 */

public class demo01 {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        MyHandle myHandle = new MyHandle();
        saxParser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/xml/index.xml"), myHandle);
        List<User> users = myHandle.getUsers();
        for (User item : users) {
            System.out.println(item.getName() + "----------------" + item.getAuthor());
        }
    }
}

class MyHandle extends DefaultHandler {
    private List<User> users = new ArrayList<>();
    private String tag;
    private User user;

    public MyHandle() {
        super();
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if (null != qName) {
            tag = qName;
        }
        if (null != qName && qName.equals("book")) {
            this.user = new User();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        if (null != qName && qName.equals("book")) {
            if (null != user) {
                this.users.add(this.user);
            }
        }
        this.tag = null;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        String line = new String(ch, start, length).trim();
        // 如果是名字标签
        if (null != tag && tag.equals("name")) {
            user.setName(line);
        } else if (null != tag && tag.equals("author")) {
            user.setAuthor(line);
        }
    }


}



