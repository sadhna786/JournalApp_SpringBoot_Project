package net.engineeringdigest.journalApp.entity;

import java.time.LocalDateTime;
// import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import net.engineeringdigest.journalApp.enums.Sentiment;

@Document(collection =  "journal_entries")
@Data
@NoArgsConstructor
public class JournalEntry {

     @Id
    private ObjectId id;
    @NonNull
     private String title;
     private String content;
     private LocalDateTime date;
     private Sentiment sentiment;
     

}
