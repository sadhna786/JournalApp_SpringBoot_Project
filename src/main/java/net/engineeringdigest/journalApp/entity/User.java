package net.engineeringdigest.journalApp.entity;

// import java.time.LocalDateTime;
import java.util.ArrayList;
// import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection =  "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
     private ObjectId id;
     @Indexed(unique = true)
     @NonNull
     private String userName;
     private String email;
     private boolean sentimentAnalysis;
     @NonNull
     private String password;

     @DBRef
     private List<JournalEntry> journalEntries = new ArrayList<>();
     private List<String> roles;
    public static Object builder() {
    
        throw new UnsupportedOperationException("Unimplemented method 'builder'");
    }
    
}
