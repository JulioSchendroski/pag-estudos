package com.ms.email.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ms.email.Model.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
    
}
