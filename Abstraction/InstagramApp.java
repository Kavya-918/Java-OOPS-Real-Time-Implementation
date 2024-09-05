interface UserActions {
    void sendRequest(String userId);
    void acceptRequest(String userId);
    void sendMessage(String userId, String message);
    void postContent(String content);
    void likePost(String postId);
    void sharePost(String postId);
    void commentOnPost(String postId, String comment);
    void searchAccount(String query);
    void postStory(String storyContent);
    void sendReel(String reelId);
    void viewStory(String storyId);
    void storyContent(String storyContent);
}

// Abstract class representing an Instagram profile
abstract class InstagramProfile implements UserActions {
    protected String name;
    protected String instaId;

    // Constructor to initialize the profile
    public InstagramProfile(String name, String instaId) {
        this.name = name;
        this.instaId = instaId;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayProfileInfo();
}

// Concrete class representing a user profile
class UserProfile extends InstagramProfile {

    // Constructor to initialize the user profile
    public UserProfile(String name, String instaId) {
        super(name, instaId);
    }

    @Override
    public void sendRequest(String userId) {
        System.out.println("Sent friend request to: " + userId);
    }

    @Override
    public void acceptRequest(String userId) {
        System.out.println("Accepted friend request from: " + userId);
    }

    @Override
    public void sendMessage(String userId, String message) {
        System.out.println("Message to " + userId + ": " + message);
    }

    @Override
    public void postContent(String content) {
        System.out.println("Posted content: " + content);
    }

    @Override
    public void likePost(String postId) {
        System.out.println("Liked post: " + postId);
    }

    @Override
    public void sharePost(String postId) {
        System.out.println("Shared post: " + postId);
    }

    @Override
    public void commentOnPost(String postId, String comment) {
        System.out.println("Commented on post " + postId + ": " + comment);
    }

    @Override
    public void searchAccount(String query) {
        System.out.println("Searched for account: " + query);
    }

    @Override
    public void postStory(String storyContent) {
        System.out.println("Posted story: " + storyContent);
    }

    @Override
    public void sendReel(String reelId) {
        System.out.println("Sent reel: " + reelId);
    }

    @Override
    public void viewStory(String storyId) {
        System.out.println("Viewed story: " + storyId);
    }

    @Override
    public void storyContent(String storyContent) {
        System.out.println("Story content: " + storyContent);
    }

    // Display the profile information
    @Override
    public void displayProfileInfo() {
        System.out.println("User Profile: " + name + " | Instagram ID: " + instaId);
    }
}

public class InstagramApp {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("Kshitij", "kenganavar");
        user.displayProfileInfo();
        user.sendRequest("Tap_Academy");
        user.acceptRequest("kshitij_kenganavar");
        user.sendMessage("kshitij_kenganavar", "Hello! sir");
        user.postContent("Topic: Multithreading in Java");
        user.likePost("Post_TapPlacedstudent");
        user.sharePost("kshitij_kenganavar");
        user.commentOnPost("post_TapPost", "Congrats!");
        user.sendReel("_.Kavyasri_");
        user.viewStory("rohit_ravendra");
        user.storyContent("Java Topic");
    }
}
