package com.alworoud

class Property {
    String propType
    String street
    String area
    String city
    String status
    String remarks
    Date dateCreated
    Date lastUpdated
    static constraints = {
        propType(blank:false, inList:(['Building','Compound','Land']))
        street(nullable:true)
        area(nullable:true)
        city(nullable:true)
        status(blank:false,inList:(['Vacant','Rent','Lease','Maintenance','Sale','Sold']))
        remarks(nullable:true)
    }
    static belongsTo = [owners:Owner]
    static hasMany = [owners:Owner, units:Unit]
}
