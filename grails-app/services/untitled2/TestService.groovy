package untitled2

import grails.gorm.transactions.Transactional

@Transactional
class TestService {

    def serviceMethod(SecondEntity secondEntity) {
        new FirstEntity(num: 1).save()
        secondEntity.failed = true
        secondEntity.save()
    }
}
