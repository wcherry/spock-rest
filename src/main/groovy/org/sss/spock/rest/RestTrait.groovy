package org.sss.spock.rest

import wslite.rest.RESTClient
import wslite.rest.RESTClientException

/**
 * Created by wcherry on 11/29/15.
 */
trait RestTrait {

    RESTClient client

    def setUrl(String url) {
        client = new RESTClient(url)
    }

    def get(Map params, Closure closure=null){
        def resp
        try{
            resp = client.get(params,  closure)
        } catch(RESTClientException ex){
            ex.printStackTrace()
            resp = ex.response
        }
        resp
    }

    def put(Map params, Closure closure=null){
        def resp
        try{
            resp = client.put(params,  closure)
        } catch(RESTClientException ex){
            ex.printStackTrace()
            resp = ex.response
        }
        resp
    }

    def post(Map params, Closure closure=null){
        def resp
        try{
            resp = client.post(params,  closure)
        } catch(RESTClientException ex){
            ex.printStackTrace()
            resp = ex.response
        }
        resp
    }

    def delete(Map params, Closure closure=null){
        def resp
        try{
            resp = client.delete(params,  closure)
        } catch(RESTClientException ex){
            ex.printStackTrace()
            resp = ex.response
        }
        resp
    }
}