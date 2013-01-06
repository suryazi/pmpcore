package com.alworoud

class Property {

    String propType
    String street
    String city
    Double area
    String status
    Date dateCreated
    Date lastUpdated
    static constraints = {
        propType(blank:false)
        status(blank:false,inList:(['Vacant','Rent','Lease','Maintenance','Sale','Sold']))
    }
    static belongsTo = [owners:Owner]
    static hasMany = [owners:Owner, units:Unit]
}
