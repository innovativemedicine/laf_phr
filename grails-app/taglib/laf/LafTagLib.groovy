package laf

class LafTagLib {
    
    def activePageClass  = {
        
        attrs, body ->
        
        // Sets the active class to the proper navigation menu for the given page
        if (g.pageProperty(name:'title').startsWith(attrs.pageTitle))
        {
//            println('------------------------------') // DEBUG LINES
//            println(g.pageProperty(name:'title') + '        ' + attrs.pageTitle)
            out << 'active'
        } else {
//            println(g.pageProperty(name:'title') + '        ' + attrs.pageTitle)
        }
    }
}
