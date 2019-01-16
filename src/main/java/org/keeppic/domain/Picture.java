package org.keeppic.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.File;
import java.sql.Timestamp;

/**
 * @author Evgeny Khodzitskiy (evgeny.hodz@gmail.com)
 * @since 04.02.2018
 */
@Entity
@Table(name = "pictures")
@Access(AccessType.FIELD)
public class Picture {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "image")
    @NotNull
    private File image;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "uploadDate")
    @NotNull
    private Timestamp uploadDate;

    @Column(name = "userIdentifier")
    private String userIdentifier;

    @Column(name = "straight")
    @NotNull
    private String straight;

    @Column(name = "forum")
    @NotNull
    private String forum;

    @Column(name = "increaseByClick")
    @NotNull
    private String increaseByClick;

    @Column(name = "htmlPicInText")
    @NotNull
    private String htmlPicInText;

    @Column(name = "htmlIncreaseByClick")
    @NotNull
    private String htmlIncreaseByClick;

    public Picture() {
    }

    /**
     * Sets new image.
     *
     * @param image New value of image.
     */
    public void setImage(File image) {
        this.image = image;
    }

    /**
     * Gets forum.
     *
     * @return Value of forum.
     */
    public String getForum() {
        return forum;
    }

    /**
     * Sets new increaseByClick.
     *
     * @param increaseByClick New value of increaseByClick.
     */
    public void setIncreaseByClick(String increaseByClick) {
        this.increaseByClick = increaseByClick;
    }

    /**
     * Gets htmlPicInText.
     *
     * @return Value of htmlPicInText.
     */
    public String getHtmlPicInText() {
        return htmlPicInText;
    }

    /**
     * Sets new forum.
     *
     * @param forum New value of forum.
     */
    public void setForum(String forum) {
        this.forum = forum;
    }

    /**
     * Gets htmlIncreaseByClick.
     *
     * @return Value of htmlIncreaseByClick.
     */
    public String getHtmlIncreaseByClick() {
        return htmlIncreaseByClick;
    }

    /**
     * Sets new htmlPicInText.
     *
     * @param htmlPicInText New value of htmlPicInText.
     */
    public void setHtmlPicInText(String htmlPicInText) {
        this.htmlPicInText = htmlPicInText;
    }

    /**
     * Gets uploadDate.
     *
     * @return Value of uploadDate.
     */
    public Timestamp getUploadDate() {
        return uploadDate;
    }

    /**
     * Sets new htmlIncreaseByClick.
     *
     * @param htmlIncreaseByClick New value of htmlIncreaseByClick.
     */
    public void setHtmlIncreaseByClick(String htmlIncreaseByClick) {
        this.htmlIncreaseByClick = htmlIncreaseByClick;
    }

    /**
     * Gets image.
     *
     * @return Value of image.
     */
    public File getImage() {
        return image;
    }

    /**
     * Gets straight.
     *
     * @return Value of straight.
     */
    public String getStraight() {
        return straight;
    }

    /**
     * Sets new straight.
     *
     * @param straight New value of straight.
     */
    public void setStraight(String straight) {
        this.straight = straight;
    }

    /**
     * Gets id.
     *
     * @return Value of id.
     */
    public long getId() {
        return id;
    }

    /**
     * Gets increaseByClick.
     *
     * @return Value of increaseByClick.
     */
    public String getIncreaseByClick() {
        return increaseByClick;
    }

    /**
     * Sets new uploadDate.
     *
     * @param uploadDate New value of uploadDate.
     */
    public void setUploadDate(Timestamp uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * Sets new userIdentifier.
     *
     * @param userIdentifier New value of userIdentifier.
     */
    public void setUserIdentifier(String userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    /**
     * Gets userIdentifier.
     *
     * @return Value of userIdentifier.
     */
    public String getUserIdentifier() {
        return userIdentifier;
    }

    /**
     * Sets new id.
     *
     * @param id New value of id.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets new name.
     *
     * @param name New value of name.
     */
    public void setName(String name) {
        this.name = name;
    }
}
