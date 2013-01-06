package com.alworoud

class Unit {

    String unitType
    String Desc
    Double area
    String status
    Date dateCreated
    Date lastUpdated
    static constraints = {
        unitType(blank:false)
        status(blank:false,inList:(['Vacant','Rent','Lease','Maintenance','Sale','Sold']))
    }
    static belongsTo = [prop : Property]
}

