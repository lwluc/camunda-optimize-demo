package de.lw.worker;

import info.novatec.micronaut.camunda.external.client.feature.ExternalTaskSubscription;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;

import static java.lang.Long.parseLong;

@Slf4j
@Singleton
@ExternalTaskSubscription(topicName = "exampleWorker")
public class ExampleTaskHandler implements ExternalTaskHandler {

    @Override
    public void execute(ExternalTask externalTask,
                        ExternalTaskService externalTaskService) {
        boolean shouldBeExecuted = parseLong(externalTask.getId()) % 2 == 0;

        if (shouldBeExecuted) {
            externalTaskService.complete(externalTask);
            log.info("The External Task {} has been completed!", externalTask.getId());
            return;
        }

        log.warn("The External Task {} has been skipped!", externalTask.getId());
    }
}