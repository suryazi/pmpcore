package com.alworoud

class Property {

    String pType
    String Street
    String city
    Double area
    String status
    Date dateCreated
    Date lastUpdated
    static constraints = {
        pType(blank:false)
        status(blank:false,inList:(['Vacant','Rent','Lease','Maintenance','Sale','Sold']))
    }
    static belongsTo = [owners:Owner]
    static hasMany = [owners:Owner, units:Unit]
}
