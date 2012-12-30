package com.alworoud

class Unit {

    String uType
    String Desc
    Double area
    String status
    Date dateCreated
    Date lastUpdated
    static constraints = {
        uType(blank:false)
        status(blank:false,inList:(['Vacant','Rent','Lease','Maintenance','Sale','Sold']))
    }
    static belongsTo = [prop : Property]
}

