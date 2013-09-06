/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.craftminecraft.thoth.api;

import java.net.InetAddress;

/**
 * Represents a node part of the Thoth network.
 * @author roblabla
 */
public interface Server {
    /**
     * The unique ID of that server.
     */
    public int getId();
    /**
     * The server's name. May or may not be unique, depending on config and implementation.
     */
    public String getName();
    /**
     * The server's address.
     */
    public InetAddress getAddress();
    public String getType();
}