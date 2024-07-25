package org.jmresler.sakila.batch.config;

import lombok.extern.slf4j.Slf4j;
import org.jmresler.sakila.batch.lstnrs.ApplicationListener;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Slf4j
@Configuration
public class BatchConfiguration {


    private int chunkSize;

    public BatchConfiguration(@Value("${application.chunk.size:25}") int chunkSize) {
        this.chunkSize = chunkSize;
    }


    @Autowired
    public Job batchJob(
            final JobRepository jobRepository,
            final ApplicationListener applicationListener,
            final Step startStep,
            final Step stopStep
    ) {
        return null;
    }

    @Autowired
    protected Step startStep(
            final ApplicationListener applicationListener,
            final PlatformTransactionManager transactionManager,
            final JobRepository jobRepository
    ) {
        return null;
    }

    @Autowired
    protected Step stopStep(
            final ApplicationListener applicationListener,
            final PlatformTransactionManager transactionManager
    ) {
        return null;
    }


    // Readers, Writers


    // Listeners
    @Autowired
    protected ApplicationListener applicationListener() {
        return new ApplicationListener();
    }
}
