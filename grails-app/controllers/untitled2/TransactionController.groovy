package untitled2

import grails.gorm.transactions.Transactional

@Transactional
class TransactionController {

    TestService testService

    def index() {
        SecondEntity secondEntity = SecondEntity.get(1)
        this.testService.serviceMethod(secondEntity)
        forward action: 'complete'
    }

    def complete() {
        render 'completed'
    }
}
