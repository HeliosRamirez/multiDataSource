package multidatasource.sto

class UserController {

    def userService

    def index() {
        userService.saveUser()
        def users = userService.allUsers()
        [users: users]
    }
}
