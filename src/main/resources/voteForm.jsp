<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>VotePage</title>
    <style> p {
        size: 20px;
        text-align: center; /*text alignment*/
    }

    .select {
        background-color: snow
    }

    .choice {
        background-color: mintcream
    }

    .introduction_text {
        background-color: cornsilk
    }

    /*set class properties, higher priority than p{}*/
    </style>
<body>
<form method="post" name="voting" action="/it_acad_HW_HTML_with_servlet_headers-1.0-SNAPSHOT/vote_form">
    <p class="select"> <!--declaring classes to group properties-->
        HW voting form <br> <br> <br>
        Select the best singer
        <label>
            <select name="singer">
                <option value="">Choose an option</option>
                <option>Michael Jackson</option>
                <option>Stevie Wonder</option>
                <option>Marvin Gaye</option>
                <option>Freddie Mercury</option>
            </select>
        </label>
    </p>
    <p class="choice"> Choose your favorite music genres <br>
        Only 3-5 options are allowed <br>
        <label> <input type="checkbox" name="genres" value="Rock"/>Rock</label>
        <label> <input type="checkbox" name="genres" value="Jazz"/>Jazz</label> <br>
        <label> <input type="checkbox" name="genres" value="Electronic Dance Music"/> Electronic Dance Music</label> <br>
        <label> <input type="checkbox" name="genres" value="Dub-step"/> Dub-step</label>
        <label> <input type="checkbox" name="genres" value="Techno"/> Techno</label> <br>
        <label> <input type="checkbox" name="genres" value="Rhythm and Blues"/> Rhythm and Blues</label> <br>
        <label> <input type="checkbox" name="genres" value="Country"/> Country</label>
        <label> <input type="checkbox" name="genres" value="Pop"/> Pop</label> <br>
        <label> <input type="checkbox" name="genres" value="Alternative Rock"/> Alternative Rock</label> <br>
        <label> <input type="checkbox" name="genres" value="Classical music"/> Classical music</label> <br>
    </p>

    <p class="introduction_text"> Perform an introduction text about yourself <br>
        <label>
            <textarea rows="5" cols="30" name="message"></textarea>
        </label>
    </p>
    <p><input type="submit" name="submit_btn" value="Submit"></p>
</form>
</body>
</html>