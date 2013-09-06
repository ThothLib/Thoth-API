/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.craftminecraft.thoth.util;

import net.craftminecraft.thoth.api.Thoth;

/**
 *
 * @author roblabla <robinlambertz.dev@gmail.com>
 */
public class RemoteVar<T> {
    private String channel;
    private String varname;
    private T obj;

    public RemoteVar(String channel, String varname) {
        this.channel = channel;
        this.varname = varname;
        Thoth.createCommunicator("ThothAPI").runMethod(new Callback() {

            public void call(Object arg, Throwable err) {
                RemoteVar.this.obj = (T) arg;
            }

        }, Thoth.getMasterServer(), "getVar", (channel + " " + varname).getBytes());
    }

    public T get() {
        return obj;
    }
    
    public void set(T obj) {
        this.obj = obj;
        
    }
}
