import org.example.Role
import org.example.User
import org.example.UserRole

class BootStrap {

    def init = { servletContext ->
        createRole()
        createUserAndUserRole()

    }
    def destroy = {
    }


    void createRole(){
        Role.findOrSaveByAuthority("ROLE_USER")
        Role.findOrSaveByAuthority("ROLE_ADMIN")
    }

    void createUserAndUserRole(){
        Role userRole = Role.findByAuthority("ROLE_USER")
        Role adminRole = Role.findByAuthority("ROLE_ADMIN")

        User user = createUser("madhav.khanna@intelligrape.com")
        createUserRole(user,userRole)

        user = createUser("madhav.khanna@tothenew.com")
        createUserRole(user,adminRole)
        createUserRole(user,userRole)
    }

    User createUser(String username,String password = "1234"){
        return new User(username:username,password:password).save(flush: true)
    }

    void createUserRole(User user,Role role){
        new UserRole(user:user,role:role).save(flush: true)
    }
}
