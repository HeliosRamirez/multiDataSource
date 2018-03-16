package multidatasource.sto

import grails.gorm.transactions.Transactional

@Transactional
class UserService {

    def allUsers() {
        User.findAll()
    }

    def saveUser() {
        new User(firstName: 'first', lastName: 'last').stoWrite.save()
    }
}
