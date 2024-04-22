# j-lawyer-ai
j-lawyer.AI module

Swagger UI:
http://localhost:8081/swagger-ui/index.html

Default credentials:
admin / a


## Models / Backends

### Transcription: Whisper

works offline, not data is shared with 3rd parties

installation:
clone repository
- git clone https://github.com/ggerganov/whisper.cpp.git
download model (multilingual in this case:
- bash ./models/download-ggml-model.sh base 
build
- make
record some own sound via microphone
- (somehow)
whisper requires 16khz mono wave files - ffmep can be used for conversion:
- ffmpeg -i soundclip.wav -ac 1 -ar 16000 soundclip-16khz.wav 
verify transcribe & translate:
- ./main -m /home/jens/dev/j-lawyer-ai-models/whisper/whisper.cpp/models/ggml-base.bin -f samples/jfk.wav
- this will output spoken german audio in english
verify transcribe only:
- ./main -m /home/jens/dev/j-lawyer-ai-models/whisper/whisper.cpp/models/ggml-base.bin -f samples/jfk.wav --language DE
- this will output spoken german as german text
save transription result to a text file:
- ./main -m /home/jens/dev/j-lawyer-ai-models/whisper/whisper.cpp/models/ggml-base.bin -f soundclip-16khz.wav --language DE --output-txt --output-file soundclip
