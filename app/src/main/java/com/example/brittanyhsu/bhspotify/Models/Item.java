package com.example.brittanyhsu.bhspotify.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

<<<<<<< HEAD
=======

>>>>>>> 3bd07be0f7c8b51c2579b84aaf66689b093149df
import java.util.List;

/**
 * Created by brittanyhsu on 7/6/17.
 */

public class Item {

    @SerializedName("collaborative")
    @Expose
    private Boolean collaborative;
    @SerializedName("external_urls")
    @Expose
    private ExternalUrls externalUrls;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("public")
    @Expose
    private Boolean _public;
    @SerializedName("snapshot_id")
    @Expose
    private String snapshotId;
    @SerializedName("tracks")
    @Expose
    private Tracks tracks;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("uri")
    @Expose
    private String uri;
///////////
//    @SerializedName("album")
//    @Expose
//    private Album album;
//    @SerializedName("artists")
//    @Expose
//    private List<Artist_> artists = null;
//    @SerializedName("available_markets")
//    @Expose
//    private List<String> availableMarkets = null;
//    @SerializedName("disc_number")
//    @Expose
//    private Integer discNumber;
//    @SerializedName("duration_ms")
//    @Expose
//    private Integer durationMs;
//    @SerializedName("explicit")
//    @Expose
//    private Boolean explicit;
//    @SerializedName("external_ids")
//    @Expose
//    private ExternalIds externalIds;
//    @SerializedName("external_urls")
//    @Expose
//    private ExternalUrls___ externalUrls___;
//
//    @SerializedName("popularity")
//    @Expose
//    private Integer popularity;
//    @SerializedName("preview_url")
//    @Expose
//    private String previewUrl;
//    @SerializedName("track_number")
//    @Expose
//    private Integer trackNumber;


    public Boolean getCollaborative() {
        return collaborative;
    }

    public void setCollaborative(Boolean collaborative) {
        this.collaborative = collaborative;
    }

    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(ExternalUrls externalUrls) {
        this.externalUrls = externalUrls;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public Tracks getTracks() {
        return tracks;
    }

    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

}
