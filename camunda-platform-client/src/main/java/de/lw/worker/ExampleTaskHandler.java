package de.lw.worker;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;

@Slf4j
@ExternalTaskSubscription(topicName = "exampleWorker")
class ExampleTaskHandler implements ExternalTaskHandler {

    @Override
    public void execute(ExternalTask externalTask,
                        ExternalTaskService externalTaskService) {
        boolean shouldBeExecuted = (Math.random() * 49 + 1) % 2 == 0;

        if (shouldBeExecuted) {
            externalTaskService.complete(externalTask);
            log.info("The External Task {} has been completed!", externalTask.getId());
            return;
        }

        log.warn("The External Task {} has been skipped!", externalTask.getId());
    }
}