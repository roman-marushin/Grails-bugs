package untitled2

import grails.gorm.transactions.Transactional

@Transactional
class EntryService {

    def serviceMethod() {
        new FirstEntity(num: 1).save()
    }
}
